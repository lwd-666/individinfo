package com.arglio.individ.mq.pojo.dto;


import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Mr.Li
 * @since 2023-03-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value="Course对象", description="")
public class CourseMq implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String cid;
    private String cname;
    private String tid;
}
