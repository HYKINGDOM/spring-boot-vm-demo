package com.java.talent.platform.vm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.proxy.HibernateProxy;

 
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "creator_info_back")
public class CreatorInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

     
    @Id
    @Column(name = "creator_id")
    private String creatorId;
     

    private String creatorName;
     

    private String creatorNickname;
     

    private String creatorPortrait;
     

    private String mcnContract;
     

    private String creatorCategories;
     

    private String ecommerceType;
     

    private String creatorVerification;
     

    private String description;
     

    private String homepage;
     

    private String email;
     

    private String country;
     

    private String capName;
     

    private Date addTime;
     

    private Date updateTime;
     

    private String sourcePlatform;
     

    private Integer fansNum;
     

    private Integer followers;
     

    private Integer likes;
     

    private Integer videos;

    private Integer livestreamings;
     

    private Long videoGpmMin;
     

    private Long videoGpmMax;
     

    private Long liveGpmMin;
     

    private Long liveGpmMax;
     

    private Integer nationalRank;
     

    private Integer relatedShops;
     

    private Integer promotedProducts;
     

    private String productCategoriesTop1;
     

    private Long productCategoriesProportionTop1;
     

    private String productCategoriesTop2;
     

    private Long productCategoriesProportionTop2;
     

    private String productCategoriesTop3;
     

    private Long productCategoriesProportionTop3;
     

    private String productCategoriesTop4;
     

    private Long productCategoriesProportionTop4;
     

    private String productCategoriesTop5;
     

    private Long productCategoriesProportionTop5;
     

    private Long fans1824Percent;
     

    private Long fans2534Percent;
     

    private Long fans35AbovePercent;
     

    private Long femalePercent;
     

    private Long malePercent;
     

    private Integer recent30VideosViews;
     

    private Integer recent30VideosLikes;
     

    private Integer recent30VideosComments;
     

    private Integer recent30VideosShares;
     

    private Long recent30DaysGmv;
     

    private Integer videoslikesGained7days;
     

    private Integer ecommerceLives7days;
     

    private Integer videos7days;
     

    private Integer followersGained7days;
     

    private Integer videoIpm7days;

    private Integer ecommerceVideos28days;

    private Integer productsPromotedInVideos28days;

    private String fansMainAge;

    private String fansMainSex;

    private Double videoGmv28days;

    private Double liveGmv28days;

    private Double totalGmv28days;

    private Double productEcommerceOrdersMax;

    @Override
    public final boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Class<?> oEffectiveClass =
            o instanceof HibernateProxy ? ((HibernateProxy)o).getHibernateLazyInitializer().getPersistentClass()
                : o.getClass();
        Class<?> thisEffectiveClass =
            this instanceof HibernateProxy ? ((HibernateProxy)this).getHibernateLazyInitializer().getPersistentClass()
                : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) {
            return false;
        }
        CreatorInfo that = (CreatorInfo)o;
        return getCreatorId() != null && Objects.equals(getCreatorId(), that.getCreatorId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy)this).getHibernateLazyInitializer()
            .getPersistentClass().hashCode() : getClass().hashCode();
    }
}
