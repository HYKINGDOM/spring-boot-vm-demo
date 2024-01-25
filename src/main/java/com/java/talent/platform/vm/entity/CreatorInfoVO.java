package com.java.talent.platform.vm.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * @author meta
 */
@Data
public class CreatorInfoVO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /** 达人ID */

    private String creatorId;
    /** 达人名称 */

    private String creatorName;


}
