package com.example.demo.repositories;

import java.util.List;

import com.example.demo.entities.Target;
import com.example.demo.entities.TargetRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Repository
public class TargetRepository {

    private final JdbcTemplate jdbcTemplate;
    @Autowired
    public TargetRepository(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    

	public List<Target> getAll(){
        String sql="SELECT * FROM targets";
        RowMapper<Target> rowMapper =new TargetRowMapper();
        return this.jdbcTemplate.query(sql, rowMapper);
    }

    public void addTarget(Target target){
        String sql="INSERT INTO targets (userid,title,description,solution,percentage,status,created,lastupdated) VALEUS (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,target.getUserId(),target.getTitle(),target.getDescription(),target.getSolution(),target.getPercentage(),target.getStatus(),target.getCreated(),target.getLastupdated());
    }
	
}