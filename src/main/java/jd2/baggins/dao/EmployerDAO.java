package jd2.baggins.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jd2.baggins.pojos.Employer;
import jd2.baggins.utils.AppConfig;

public class EmployerDAO {

    public static final String getEmployerByIdQuery = "SELECT * FROM t_employers WHERE c_ID = ?";
    private JdbcTemplate jdbcTemplate;

    public Employer getEmployerById(Long id) {
        return (Employer) jdbcTemplate.queryForObject(getEmployerByIdQuery, new AppConfig().employerRowMapper(), id);
    }
}
