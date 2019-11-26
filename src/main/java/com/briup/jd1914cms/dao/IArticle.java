package com.briup.jd1914cms.dao;

import com.briup.jd1914cms.bean.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IArticle extends JpaRepository<Article,Integer> {
}
