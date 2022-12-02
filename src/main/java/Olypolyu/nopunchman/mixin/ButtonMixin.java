package Olypolyu.nopunchman.mixin;

import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockButton.class, remap = false)
public class ButtonMixin extends Block {

    public ButtonMixin(int i, Material material) {
        super(i, material);
    }

    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer) {}

}
