package com.briup.jd1914cms.dao;

import com.briup.jd1914cms.bean.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryDao extends JpaRepository<Category,Integer> {
}
