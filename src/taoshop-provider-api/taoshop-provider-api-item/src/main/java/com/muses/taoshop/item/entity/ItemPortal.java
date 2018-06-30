package com.muses.taoshop.item.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 *  定义一个在门户网站显示商品信息的VO类
 * </pre>
 *
 * @author nicky
 * @version 1.00.00
 * <pre>
 * 修改记录
 *    修改后版本:     修改人：  修改日期: 2018.06.30 17:17    修改内容:
 * </pre>
 */
@Setter
@Getter
@ToString
public class ItemPortal {

    /**
     * sku的最低售价
     */
    private long mPrice;

    /**
     * 产品名称
     */
    private String itemName ;


}
