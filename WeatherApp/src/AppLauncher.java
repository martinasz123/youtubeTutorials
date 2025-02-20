import javax.swing.*;
//Credit to https://www.youtube.com/@TapTap_196
//This weather app was made by following this tutorial: https://www.youtube.com/watch?v=8ZcEYv2ezWc&t=843s
public class AppLauncher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new WeatherAppGui().setVisible(true);

            }
        });
    }
}