package com.cave.utils.dbutil.mapper;

import com.cave.utils.dbutil.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class SimpleResultSetMapper<E> implements ResultSetMapper<E> {

	@Override
	public void init(ResultSet rs) throws SQLException {
		
	}

	@Override
	public abstract E mapObject(ResultSet rs) throws SQLException;

	@Override
	public void terminate() {	
		
	}

}