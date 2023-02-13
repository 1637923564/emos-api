package com.example.emos.api.db.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.Set;

@Mapper
public interface TbUserDao {
    public Set<String> searchUserPermissions(int userId);
}
