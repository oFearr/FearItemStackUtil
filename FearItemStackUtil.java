package me.ofearr.Utils;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class FearItemStackUtil {

    public static ItemStack getVersionItemStack(String nonLegMaterial, int amount){

        switch (nonLegMaterial){
            case "black_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 15); 
                 else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
                
            case "black_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 15);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "blue_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 11);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "blue_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 11);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount); 
                }
            case "brown_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 12);
                else{
                return new ItemStack(Material.valueOf(nonLegMaterial), amount);
            }
            case "brown_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 12);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
                
            case "cyan_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 9);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "cyan_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 9);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "grey_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 7);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "gray_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 7);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "green_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 13);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "green_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 13);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "light_blue_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 3);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "light_blue_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 3);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "light_grey_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 8);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "light_grey_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 8);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "lime_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 5);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "lime_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 5);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "magenta_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 2);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "magenta_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 2);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "orange_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 1);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "orange_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 1);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "pink_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 6);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "pink_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 6);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "purple_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 10);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "purple_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 10);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "red_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 14);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "red_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 14);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "white_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 0);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "white_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 0);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "yellow_stained_glass":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS, amount, (short) 4);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "yellow_stained_glass_pane":
                if(isLegacy()) return new ItemStack(Material.STAINED_GLASS_PANE, amount, (short) 4);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "black_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 15);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "blue_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 11);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "brown_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 12);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "cyan_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 9);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "gray_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 7);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "green_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 13);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "light_blue_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 3);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "light_gray_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 8);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "lime_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 5);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "magenta_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 2);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "orange_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 1);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "pink_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 6);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "purple_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 10);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "red_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 14);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "white_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 0);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            case "yellow_wool":
                if(isLegacy()) return new ItemStack(Material.WOOL, amount, (short) 4);
                else{
                    return new ItemStack(Material.valueOf(nonLegMaterial), amount);
                }
            default:
                return null;
        }
    }

    static String version = Bukkit.getServer().getVersion();

    public static boolean isLegacy(){
        if (version.contains("1.13")) {
            return false;
        } else if (version.contains("1.14")) {
            return false;
        } else if (version.contains("1.15")) {
            return false;
        } else if (version.contains("1.16")) {
            return false;
        } else{
            return true;
        }
    }
}
