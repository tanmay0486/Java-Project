import java.applet.*;  
import java.awt.*;
import java.awt.event.*; 

public class Conversion extends Applet implements ActionListener {
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);
    Choice c1 = new Choice();
    Choice c2 = new Choice();
    Button b1 = new Button("Calculate");

    public void init(){
        c1.add("Select");
        c1.add("Square Kilometers");
        c1.add("Square Meters");
        c1.add("Square Miles");
        c1.add("Square Yards");
        c1.add("Square Foot");
        c1.add("Square Inches");
        c1.add("Hectares");
        c1.add("Acres");
        c2.add("Select");
        c2.add("Square Kilometers");
        c2.add("Square Meters");
        c2.add("Square Miles");
        c2.add("Square Yards");
        c2.add("Square Foot");
        c2.add("Square Inches");
        c2.add("Hectares");
        c2.add("Acres");
        add(t1);
        add(t2);
        add(c1);
        add(c2);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        double a,c;
        if(c1.getSelectedItem()=="Square Kilometers" && c2.getSelectedItem()=="Square Kilometers"){
            a = Double.parseDouble(t1.getText());
            c = a*a;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Kilometers" && c2.getSelectedItem()=="Square Meters"){
            a = Double.parseDouble(t1.getText());
            c = a*1000000;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Kilometers" && c2.getSelectedItem()=="Square Miles"){
            a = Double.parseDouble(t1.getText());
            c = a*0.386102;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Kilometers" && c2.getSelectedItem()=="Square Yards"){
            a = Double.parseDouble(t1.getText());
            c = a*1195990.04;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Kilometers" && c2.getSelectedItem()=="Square Foot"){
            a = Double.parseDouble(t1.getText());
            c = a*10763910.4;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Kilometers" && c2.getSelectedItem()=="Square Inches"){
            a = Double.parseDouble(t1.getText());
            c = a*15500031000.0;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Kilometers" && c2.getSelectedItem()=="Hectares"){
            a = Double.parseDouble(t1.getText());
            c = a*100;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Kilometers" && c2.getSelectedItem()=="Acres"){
            a = Double.parseDouble(t1.getText());
            c = a*247.105;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Meters" && c2.getSelectedItem()=="Square Kilometers"){
            a = Double.parseDouble(t1.getText());
            c = a/1000000;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Meters" && c2.getSelectedItem()=="Square Meters"){
            a = Double.parseDouble(t1.getText());
            c = a*a;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Meters" && c2.getSelectedItem()=="Square Miles"){
            a = Double.parseDouble(t1.getText());
            c = a*0.000000386102;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Meters" && c2.getSelectedItem()=="Square Yards"){
            a = Double.parseDouble(t1.getText());
            c = a*1.195990;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Meters" && c2.getSelectedItem()=="Square Foot"){
            a = Double.parseDouble(t1.getText());
            c = a*10.763910;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Meters" && c2.getSelectedItem()=="Square Inches"){
            a = Double.parseDouble(t1.getText());
            c = a*1550.0031;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Meters" && c2.getSelectedItem()=="Hectares"){
            a = Double.parseDouble(t1.getText());
            c = a/10000;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Meters" && c2.getSelectedItem()=="Acres"){
            a = Double.parseDouble(t1.getText());
            c = a*0.000247105;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Miles" && c2.getSelectedItem()=="Square Kilometers"){
            a = Double.parseDouble(t1.getText());
            c = a*2.59;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Miles" && c2.getSelectedItem()=="Square Meters"){
            a = Double.parseDouble(t1.getText());
            c = a*2589988.110336;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Miles" && c2.getSelectedItem()=="Square Miles"){
            a = Double.parseDouble(t1.getText());
            c = a*a;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Miles" && c2.getSelectedItem()=="Square Yards"){
            a = Double.parseDouble(t1.getText());
            c = a*2090.955;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Miles" && c2.getSelectedItem()=="Square Foot"){
            a = Double.parseDouble(t1.getText());
            c = a*27878400;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Miles" && c2.getSelectedItem()=="Square Inches"){
            a = Double.parseDouble(t1.getText());
            c = a*4014489600.0;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Miles" && c2.getSelectedItem()=="Hectares"){
            a = Double.parseDouble(t1.getText());
            c = a*258.9988;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Miles" && c2.getSelectedItem()=="Acres"){
            a = Double.parseDouble(t1.getText());
            c = a*640;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Yards" && c2.getSelectedItem()=="Square Kilometers"){
            a = Double.parseDouble(t1.getText());
            c = a*0.836127;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Yards" && c2.getSelectedItem()=="Square Meters"){
            a = Double.parseDouble(t1.getText());
            c = a*0.836127;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Yards" && c2.getSelectedItem()=="Square Miles"){
            a = Double.parseDouble(t1.getText());
            c = a*0.00002090;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Yards" && c2.getSelectedItem()=="Square Yards"){
            a = Double.parseDouble(t1.getText());
            c = a*a;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Yards" && c2.getSelectedItem()=="Square Foot"){
            a = Double.parseDouble(t1.getText());
            c = a*9;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Yards" && c2.getSelectedItem()=="Square Inches"){
            a = Double.parseDouble(t1.getText());
            c = a*1296;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Yards" && c2.getSelectedItem()=="Hectares"){
            a = Double.parseDouble(t1.getText());
            c = a*0.836127;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Yards" && c2.getSelectedItem()=="Acres"){
            a = Double.parseDouble(t1.getText());
            c = a*0.000206611;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Foot" && c2.getSelectedItem()=="Square Kilometers"){
            a = Double.parseDouble(t1.getText());
            c = a*0.000001;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Foot" && c2.getSelectedItem()=="Square Meters"){
            a = Double.parseDouble(t1.getText());
            c = a*0.09290304;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Foot" && c2.getSelectedItem()=="Square Miles"){
            a = Double.parseDouble(t1.getText());
            c = a*0.00000027878;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Foot" && c2.getSelectedItem()=="Square Yards"){
            a = Double.parseDouble(t1.getText());
            c = a*0.1111111;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Foot" && c2.getSelectedItem()=="Square Foot"){
            a = Double.parseDouble(t1.getText());
            c = a*a;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Foot" && c2.getSelectedItem()=="Square Inches"){
            a = Double.parseDouble(t1.getText());
            c = a*144;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Foot" && c2.getSelectedItem()=="Hectares"){
            a = Double.parseDouble(t1.getText());
            c = a*0.000009290;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Foot" && c2.getSelectedItem()=="Acres"){
            a = Double.parseDouble(t1.getText());
            c = a*0.0000229568;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Inches" && c2.getSelectedItem()=="Square Kilometers"){
            a = Double.parseDouble(t1.getText());
            c = a*0.000000064516;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Inches" && c2.getSelectedItem()=="Square Meters"){
            a = Double.parseDouble(t1.getText());
            c = a*0.00064516;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Inches" && c2.getSelectedItem()=="Square Miles"){
            a = Double.parseDouble(t1.getText());
            c = a*0.0000000006452;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Inches" && c2.getSelectedItem()=="Square Yards"){
            a = Double.parseDouble(t1.getText());
            c = a*0.000771605;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Inches" && c2.getSelectedItem()=="Square Foot"){
            a = Double.parseDouble(t1.getText());
            c = a*0.00694444;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Inches" && c2.getSelectedItem()=="Square Inches"){
            a = Double.parseDouble(t1.getText());
            c = a*a;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Inches" && c2.getSelectedItem()=="Hectares"){
            a = Double.parseDouble(t1.getText());
            c = a*0.000000064516;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Square Inches" && c2.getSelectedItem()=="Acres"){
            a = Double.parseDouble(t1.getText());
            c = a*0.00000015924;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Hectares" && c2.getSelectedItem()=="Square Kilometers"){
            a = Double.parseDouble(t1.getText());
            c = a*0.0001;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Hectares" && c2.getSelectedItem()=="Square Meters"){
            a = Double.parseDouble(t1.getText());
            c = a*10000;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Hectares" && c2.getSelectedItem()=="Square Miles"){
            a = Double.parseDouble(t1.getText());
            c = a*0.00386102;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Hectares" && c2.getSelectedItem()=="Square Yards"){
            a = Double.parseDouble(t1.getText());
            c = a*11959.9;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Hectares" && c2.getSelectedItem()=="Square Foot"){
            a = Double.parseDouble(t1.getText());
            c = a*107639.1;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Hectares" && c2.getSelectedItem()=="Square Inches"){
            a = Double.parseDouble(t1.getText());
            c = a*15500031.0;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Hectares" && c2.getSelectedItem()=="Hectares"){
            a = Double.parseDouble(t1.getText());
            c = a*a;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Hectares" && c2.getSelectedItem()=="Acres"){
            a = Double.parseDouble(t1.getText());
            c = a*2.47105;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Acres" && c2.getSelectedItem()=="Square Kilometers"){
            a = Double.parseDouble(t1.getText());
            c = a*0.00404686;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Acres" && c2.getSelectedItem()=="Square Meters"){
            a = Double.parseDouble(t1.getText());
            c = a*4046.86;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Acres" && c2.getSelectedItem()=="Square Miles"){
            a = Double.parseDouble(t1.getText());
            c = a*0.0015625;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Acres" && c2.getSelectedItem()=="Square Yards"){
            a = Double.parseDouble(t1.getText());
            c = a*4840;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Acres" && c2.getSelectedItem()=="Square Foot"){
            a = Double.parseDouble(t1.getText());
            c = a*43560;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Acres" && c2.getSelectedItem()=="Square Inches"){
            a = Double.parseDouble(t1.getText());
            c = a*6272640;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Acres" && c2.getSelectedItem()=="Hectares"){
            a = Double.parseDouble(t1.getText());
            c = a*0.404686;
            t2.setText(String.valueOf(c));
        }
        else if(c1.getSelectedItem()=="Acres" && c2.getSelectedItem()=="Acres"){
            a = Double.parseDouble(t1.getText());
            c = a*a;
            t2.setText(String.valueOf(c));
        }
    }
}  
/* 
<applet code="Conversion.class" width="400" height="450"> 
</applet> 
*/