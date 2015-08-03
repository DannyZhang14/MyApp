package com.dannyzhang.activeandroid;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by DannyZhang on 2015/8/3.
 */
@Table(name = "Gateway")
public class Gateway extends Model {
    @Column(name = "Switch")
    public String Switch;

    @Column(name = "Occ")
    public String Occ;

    @Column(name = "WindowSensor")
    public String windowSensor;


}
