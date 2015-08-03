package com.dannyzhang.activeandroid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by DannyZhang on 2015/8/3.
 */
@Table(name = "Items")
public class Item extends Model {
    @Column(name = "AirCleaner")
    public String name;
    @Column(name = "Gateway")
    public Gateway Gateway;

    public Item() {
        super();
    }

    public Item(String name, Gateway gateway) {
        super();
        this.name = name;
        this.Gateway = gateway;
    }


}
