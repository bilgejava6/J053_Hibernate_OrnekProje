package com.muhammet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblartist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String adres;
    Date dogumTarihi;
    Integer yas;
    String avatar;
    String biyografi;
    Integer kariyerYili;
    Integer filmDiziAdedi;
    @ManyToMany
    List<Film> filmList;
}
