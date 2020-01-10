package com.example.demo.entities;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class TargetRowMapper implements RowMapper<Target> {

    @Override
    public Target mapRow(ResultSet row, int rowNum) throws SQLException {
        Target x =new Target();
        x.setId((long) row.getInt("id"));
        x.setUserId(row.getInt("userid"));
        x.setTitle(row.getString("title"));
        x.setDescription(row.getString("description"));
        x.setSolution(row.getString("solution"));
        x.setPercentage(row.getInt("percentage"));
        x.setStatus(row.getString("status"));
        x.setCreated(row.getDate("created"));
        x.setLastupdated(row.getDate("lastupdated"));
        return x;
    }

}