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
    @ManyToMany(mappedBy = "artistList")
    List<Film> filmList;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Artist{");
        sb.append("id=").append(id);
        sb.append(", ad='").append(ad).append('\'');
        sb.append(", adres='").append(adres).append('\'');
        sb.append(", dogumTarihi=").append(dogumTarihi);
        sb.append(", yas=").append(yas);
        sb.append(", avatar='").append(avatar).append('\'');
        sb.append(", biyografi='").append(biyografi).append('\'');
        sb.append(", kariyerYili=").append(kariyerYili);
        sb.append(", filmDiziAdedi=").append(filmDiziAdedi);
        sb.append('}');
        return sb.toString();
    }
}
