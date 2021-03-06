package com.xiaoka.business.online.open.sdk.output;

import java.io.Serializable;
import java.util.List;

/**
 * @author taotao@xiaokakeji.com
 * @date 2016/12/30.
 * @copy xiaokakeji
 * @description:
 */
public class OfflineNearbyShopListOutput implements Serializable {
	/**
	 * 分页索引
	 */
	private Integer pageIndex;
	/**
	 * 每页记录数
	 */
	private Integer pageSize;
	/**
	 * 总共多少页
	 */
	private Integer pageLength;
	/**
	 * 商家服务列表
	 */
	private List<OfflineNearbyShopListItemOutput> list;

	public Integer getPageIndex() {
		return pageIndex;
	}

	public void setPageIndex(Integer pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getPageLength() {
		return pageLength;
	}

	public void setPageLength(Integer pageLength) {
		this.pageLength = pageLength;
	}

	public List<OfflineNearbyShopListItemOutput> getList() {
		return list;
	}

	public void setList(List<OfflineNearbyShopListItemOutput> list) {
		this.list = list;
	}
}
