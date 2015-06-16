/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

import java.util.Date;

/**
 *
 * @author USER
 */
public class Time {
 
    private Date dt;
    private String detik;
    private String menit;
    private String jam;
 
    public TimeEntity currTime(){
        String nol_jam = "";
        String nol_menit = "";
        String nol_detik = "";
        dt = new Date();
        TimeEntity tm = timeFormat(dt.getSeconds(), dt.getMinutes(), dt.getHours());
        return tm;
    }
 
    public TimeEntity timeFormat(int s, int m, int h){
        TimeEntity te;
        String nolS="", nolM="", nolH="";
        if (s <= 9) nolS = "0";
        if (m <= 9) nolM = "0";
        if (h <= 9) nolH = "0";
        te = new TimeEntity(nolS+Integer.toString(s), nolM+Integer.toString(m), nolH+Integer.toString(h));
        return te;
    }
 
}