package yeshagnihotri.weatherdesign;

/**
 * Created by Yesh on 20-04-2017.
 */

public class DataSet {
    int icon_id;
    String time;
    float temp;
    public DataSet(int icon_id,String time,float temp)
    {
        this.icon_id=icon_id;
        this.time=time;
        this.temp=temp;
    }
    public void setIconId(int icon_id)
    {
        this.icon_id=icon_id;
    }
    public void setTime(String time)
    {
        this.time=time;
    }
    public void setTemp(float temp)
    {
        this.temp=temp;
    }
    public int getIconId()
    {
        return  icon_id;
    }
    public String getTime()
    {
        return  time;
    }
    public float getTemp()
    {
        return temp;
    }


}



