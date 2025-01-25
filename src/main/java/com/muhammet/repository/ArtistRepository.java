package com.muhammet.repository;

import com.muhammet.entity.Artist;

public class ArtistRepository extends  RepositoryManager<Artist,Long>{
    public ArtistRepository(){
        super(new Artist());
    }
}
