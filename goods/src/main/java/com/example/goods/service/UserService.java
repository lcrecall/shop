package com.example.goods.service;



import com.example.goods.entity.Goods;
import com.example.goods.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    GoodsMapper goodsMapper;
    public Goods Sel(int id){
        return goodsMapper.Sel(id);
    }
}
