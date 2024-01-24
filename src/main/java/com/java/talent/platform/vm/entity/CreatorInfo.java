package com.java.talent.platform.vm.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author meta
 */
@Data
public class CreatorInfo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /** 达人ID */

    private String creatorId;
    /** 达人名称 */

    private String creatorName;
    /** 达人昵称 */

    private String creatorNickname;
    /** 达人头像 */

    private String creatorPortrait;
    /** MCN签约 */

    private String mcnContract;
    /** 达人标签 */

    private String creatorCategories;
    /** 带货方式 */

    private String ecommerceType;
    /** 达人认证 */

    private String creatorVerification;
    /** 达人简介 */

    private String description;
    /** 主页地址 */

    private String homepage;
    /** 邮箱 */

    private String email;
    /** 达人国家 */

    private String country;
    /** 机构名称 */

    private String capName;
    /** 添加日期 */

    private Date addTime;
    /** 数据更新时间 */

    private Date updateTime;
    /** 来源平台 */

    private String sourcePlatform;
    /** 粉丝数 */

    private Integer fansNum;
    /** 累计关注数 */

    private Integer followers;
    /** 累计点赞数 */

    private Integer likes;
    /** 累计视频数 */

    private Integer videos;
    /** 累计带货直播数 */

    private Integer livestreamings;
    /** 视频GPM-最小 */

    private Long videoGpmMin;
    /** 视频GPM-最大 */

    private Long videoGpmMax;
    /** 直播GPM-最小 */

    private Long liveGpmMin;
    /** 直播GPM-最大 */

    private Long liveGpmMax;
    /** 本国排名 */

    private Integer nationalRank;
    /** 累计关联店铺数 */

    private Integer relatedShops;
    /** 累计带货商品数 */

    private Integer promotedProducts;
    /** 达人TOP1带货类目名称 */

    private String productCategoriesTop1;
    /** 达人TOP1带货类目占比 */

    private Long productCategoriesProportionTop1;
    /** 达人TOP1带货类目名称 */

    private String productCategoriesTop2;
    /** 达人TOP1带货类目占比 */

    private Long productCategoriesProportionTop2;
    /** 达人TOP1带货类目名称 */

    private String productCategoriesTop3;
    /** 达人TOP1带货类目占比 */

    private Long productCategoriesProportionTop3;
    /** 达人TOP1带货类目名称 */

    private String productCategoriesTop4;
    /** 达人TOP1带货类目占比 */

    private Long productCategoriesProportionTop4;
    /** 达人TOP1带货类目名称 */

    private String productCategoriesTop5;
    /** 达人TOP1带货类目占比 */

    private Long productCategoriesProportionTop5;
    /** 粉丝18-24年龄占比 */

    private Long fans1824Percent;
    /** 粉丝25-34年龄占比 */

    private Long fans2534Percent;
    /** 粉丝35+年龄占比 */

    private Long fans35AbovePercent;
    /** 女性占比 */

    private Long femalePercent;
    /** 男性占比 */

    private Long malePercent;
    /** 近30条视频播放数 */

    private Integer recent30VideosViews;
    /** 近30条视频点赞数 */

    private Integer recent30VideosLikes;
    /** 近30条视频评论数 */

    private Integer recent30VideosComments;
    /** 近30条视频分享数 */

    private Integer recent30VideosShares;
    /** 近30天GMV */

    private Long recent30DaysGmv;
    /** 近7日粉丝增量 */

    private Integer videoslikesGained7days;
    /** 近7日带货直播数 */

    private Integer ecommerceLives7days;
    /** 近7日视频数 */

    private Integer videos7days;
    /** 近7日视频点赞增量 */

    private Integer followersGained7days;
    /** 近7日视频IPM */

    private Integer videoIpm7days;
    /** 近28天带货视频数 */

    private Integer ecommerceVideos28days;
    /** 近28天视频带货商品数 */

    private Integer productsPromotedInVideos28days;
    /** 粉丝主要年龄(18-24,25-34,35+) */

    private String fansMainAge;
    /** 粉丝主要性别(男、女) */

    private String fansMainSex;
    /** 近28天视频带货总GMV */

    private Double videoGmv28days;
    /** 近28天直播带货总GMV */

    private Double liveGmv28days;
    /** 近28天带货总GMV */

    private Double totalGmv28days;
    /** 商品最大销量 */

    private Double productEcommerceOrdersMax;

}
