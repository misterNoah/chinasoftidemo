package com.chinasofti.sp.client.goods.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinasofti.sp.client.goods.entity.SpClientGoodsClass;
import com.chinasofti.sp.client.goods.service.SpClientGoodsService;

@RequestMapping("goodsClass")
@RestController
public class SpClientGoodsController {
	
	@Autowired
	SpClientGoodsService spClientGoodsService;

	/**
	 * 通过id查询
	 * @param ids
	 * @return
	 */
	@RequestMapping("/select/{ids}")
	@ResponseBody
	public SpClientGoodsClass selectByPrimaryKey(@PathVariable String ids){
		return spClientGoodsService.selectByPrimaryKey(ids);
	}	
	
	//查询所有顶级分类
	@RequestMapping("/selectAll")
	@ResponseBody
	public List<SpClientGoodsClass> selectAll(){
		return spClientGoodsService.selectAll();
	}	
	
	
	
}
