package com.wx.microserviceprovider.dao;

import com.wx.microserviceprovider.entity.elastic.Notice;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author weixing
 * @date 2019/1/16
 **/
@Repository
public interface NoticeDao extends ElasticsearchRepository<Notice, Long> {
}
