package Olypolyu.nopunchman.mixin;

import net.minecraft.src.*;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = BlockLever.class, remap = false)
public class LeverMixin extends Block {

    public LeverMixin(int i, Material material) {
        super(i, material);
    }

    public void onBlockClicked(World world, int i, int j, int k, EntityPlayer entityplayer) {}

}
