package smith.lib.tools.color;

import android.graphics.Color;

public class SColor {
    
    public static int darkerColor(int color, float factor) {
        int alpha = Color.alpha(color);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        return Color.argb(alpha,
                Math.max((int)(red * factor), 0),
                Math.max((int)(green * factor), 0),
                Math.max((int)(blue * factor), 0));
    }
    
    public static int darkerColor(String col, float factor) {
        int color = Color.parseColor(col);
        int alpha = Color.alpha(color);
        int red = Color.red(color);
        int green = Color.green(color);
        int blue = Color.blue(color);
        return Color.argb(alpha,
                Math.max((int)(red * factor), 0),
                Math.max((int)(green * factor), 0),
                Math.max((int)(blue * factor), 0));
    }

    public static int lighterColor(int color, float factor) {
        int alpha = Color.alpha(color);
        int red = (int) ((Color.red(color) * (1 - factor) / 255 + factor) * 255);
        int green = (int) ((Color.green(color) * (1 - factor) / 255 + factor) * 255);
        int blue = (int) ((Color.blue(color) * (1 - factor) / 255 + factor) * 255);
        return Color.argb(alpha, red, green, blue);
    }
    
    public static int lighterColor(String col, float factor) {
        int color = Color.parseColor(col);
        int alpha = Color.alpha(color);
        int red = (int) ((Color.red(color) * (1 - factor) / 255 + factor) * 255);
        int green = (int) ((Color.green(color) * (1 - factor) / 255 + factor) * 255);
        int blue = (int) ((Color.blue(color) * (1 - factor) / 255 + factor) * 255);
        return Color.argb(alpha, red, green, blue);
    }

    public static int oppositeColor(int color) {
        float[] hsv = new float[3];
        Color.RGBToHSV(Color.red(color),
                Color.green(color),
                Color.blue(color), hsv);
        hsv[0] = (hsv[0] + 180) % 360;
        return Color.HSVToColor(hsv);
    }
    
    public static int oppositeColor(String col) {
        int color = Color.parseColor(col);
        float[] hsv = new float[3];
        Color.RGBToHSV(Color.red(color),
                Color.green(color),
                Color.blue(color), hsv);
        hsv[0] = (hsv[0] + 180) % 360;
        return Color.HSVToColor(hsv);
    }
    
    public static int RGBToHSV(int color) {
        float[] hsv = new float[3];
        Color.RGBToHSV(Color.red(color),
                Color.green(color),
                Color.blue(color), hsv);
        return Color.HSVToColor(hsv);
    }
    
    public static int RGBToHSV(String col) {
        int color = Color.parseColor(col);
        float[] hsv = new float[3];
        Color.RGBToHSV(Color.red(color),
                Color.green(color),
                Color.blue(color), hsv);
        return Color.HSVToColor(hsv);
    }
}
