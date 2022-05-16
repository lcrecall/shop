package com.example.goods.mapper;



import com.example.goods.entity.Goods;
import org.springframework.stereotype.Repository;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:20
 */
@Repository
public interface GoodsMapper {

    Goods Sel(int id);
}