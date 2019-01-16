package com.wx.microserviceprovider.controller;

import com.wx.microserviceprovider.dao.NoticeDao;
import com.wx.microserviceprovider.entity.elastic.Notice;
import org.apache.lucene.util.QueryBuilder;
import org.elasticsearch.cluster.routing.allocation.AllocationService;
import org.elasticsearch.index.query.MatchQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author weixing
 * @date 2019/1/16
 **/
@RestController
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    NoticeDao noticeDao;

    @PostMapping("saveNotice")
    public Notice saveNotice(@RequestBody Notice notice) {
        return noticeDao.save(notice);
    }

    @GetMapping("getNotice")
    public List<Notice> getNotice(@RequestParam String title) {
        MatchQueryBuilder queryBuilder = QueryBuilders.matchQuery("title", title);
        Iterable<Notice> iterable = noticeDao.search(queryBuilder);
        Iterator<Notice> iterator = iterable.iterator();
        List<Notice> list = new ArrayList<>();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        return list;
    }
}
