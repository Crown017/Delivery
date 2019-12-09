package com.clown.member.mybatis;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

import java.util.Map;

@SuppressWarnings("rawtypes")
public class PageUtil {
	
	private int page;
	private int size;
	private int total;
	private int maxPage;
	
	/**
	 * 
	* <p>Title: StartPage</p>
	* <p>Description: 分页开始</p>
	* @author LiuZhao
	* @param map
	* @return
	 */
	public static <E> Page<E> StartPage(Map map) {
		int page = 0;
		String pageParm = map.get("page") != null ? map.get("page").toString() : "";
		if (!"".equals(pageParm)) {
			page = Integer.valueOf(pageParm);
			map.remove("page");
		}
		
		int size = 10;
		String sizeParm = map.get("size") != null ? map.get("size").toString() : "";
		if (!"".equals(sizeParm)) {
			size = Integer.parseInt(sizeParm);
			map.remove("size");
		}
		return PageHelper.startPage(page, size);
	}
	
	public PageUtil setPageList(int page, int size, int total) {
		PageUtil pageUtil = new PageUtil();
		
		if(page < 1){
			page = 1;
		}
		
		int maxPage;
		if(total<1){
		    maxPage=1;
		}
		else{
		    maxPage = (total-1)/size+1;
		}
		
		
		if(page >= maxPage + 1){
			page = maxPage + 1;
		}
		
		pageUtil.page = page;
		pageUtil.size = size;
		pageUtil.total = total;
		pageUtil.maxPage = maxPage; 
		PageHelper.startPage(page, size);
		
		return pageUtil;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getMaxPage() {
		return maxPage;
	}

	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}
	
}
