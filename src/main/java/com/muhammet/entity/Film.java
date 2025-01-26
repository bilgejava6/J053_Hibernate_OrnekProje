package com.muhammet.entity;

import com.muhammet.utility.enums.Tur;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tblfilm")
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String ozet;
    String yonetmenAdi;
    Long yonetmenId;
    String senarist;
    @ManyToMany(fetch = FetchType.EAGER)
    List<Artist> artistList;
    Integer puan;
    Tur tur;

}
