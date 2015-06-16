/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ann;

/**
 *
 * @author USER
 */
public class TimeEntity {
 
    private String detik;
    private String menit;
    private String jam;
 
    public TimeEntity() {
    }
 
    public TimeEntity(String detik, String menit, String jam) {
        this.detik = detik;
        this.menit = menit;
        this.jam = jam;
    }
 
    public String getDetik() {
        return detik;
    }
 
    public void setDetik(String detik) {
        this.detik = detik;
    }
 
    public String getJam() {
        return jam;
    }
 
    public void setJam(String jam) {
        this.jam = jam;
    }
 
    public String getMenit() {
        return menit;
    }
 
    public void setMenit(String menit) {
        this.menit = menit;
    }
}