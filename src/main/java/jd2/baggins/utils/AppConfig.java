package jd2.baggins.utils;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import jd2.baggins.pojos.Employer;
import jd2.baggins.pojos.Occupation;

//@Configuration
public class AppConfig {

//    @Bean
    public Occupation occupation() {
        return new Occupation();
    }

//    @Bean
    public Employer employer() {
        return new Employer();
    }

//    @Bean
    public RowMapper employerRowMapper() {
        RowMapper rm = new RowMapper() {
            public Employer mapRow(ResultSet resultSet, int i) throws SQLException {
                Employer employer = new Employer();
                employer.setId(resultSet.getLong("c_ID"));
                employer.setPosition(resultSet.getString("c_position"));
                employer.setName(resultSet.getString("c_name"));
                employer.setPhone(resultSet.getString("c_phone"));
                return employer;
            }
        };
        return rm;
    }
}
