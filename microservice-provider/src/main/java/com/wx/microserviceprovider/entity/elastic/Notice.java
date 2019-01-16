package com.wx.microserviceprovider.entity.elastic;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author weixing
 * @date 2019/1/16
 **/
@Data
@Document(indexName = "notice", type = "doc")
public class Notice {

    @("id")
    private Long id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @JsonProperty("content")
    private String content;
}
