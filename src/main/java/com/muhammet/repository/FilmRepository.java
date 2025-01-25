package com.muhammet.repository;

import com.muhammet.entity.Artist;
import com.muhammet.entity.Film;

public class FilmRepository extends RepositoryManager<Film,Long>{
    public FilmRepository() {
        super(new Film());
    }
}
