package zmaster587.libVulpes.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import zmaster587.libVulpes.api.material.Material;
import zmaster587.libVulpes.tile.TileMaterial;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlockWithMetadata;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

/*
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;
*/

public class ItemMaterialBlock extends ItemBlockWithMetadata {

	public ItemMaterialBlock(Block block) {
		super(block,block);
	}

	/*@Override
	public boolean placeBlockAt(ItemStack stack, EntityPlayer player,
			World world, int x, int y, int z, int side, float hitX, float hitY,
			float hitZ, int metadata) {
		boolean succeeded = super.placeBlockAt(stack, player, world, x, y, z, side, hitX, hitY, hitZ, 0);

		if(succeeded) {
			TileEntity tile = world.getTileEntity(x, y, z);
			if(tile instanceof TileMaterial) {
				((TileMaterial)tile).setMaterial(Material.Materials.values()[stack.getItemDamage()]);
			}
		}

		return succeeded;
	}

	@Override
	public String getUnlocalizedName(ItemStack stack) {
		return this.getUnlocalizedName() + "." + getMaterial(stack).getUnlocalizedName();
	}

	@Override
	public String getItemStackDisplayName(ItemStack itemstack) {
		if(gameSettings.language.equals("zh_cn") || gameSettings.language.equals("zh_tw"))
			return StatCollector.translateToLocal("material." + getMaterial(itemstack).getUnlocalizedName() + ".name") + StatCollector.translateToLocal(this.getUnlocalizedName());
		return StatCollector.translateToLocal("material." + getMaterial(itemstack).getUnlocalizedName() + ".name") + " " + StatCollector.translateToLocal(this.getUnlocalizedName());
	}
	
	public Material.Materials getMaterial(ItemStack stack) {
		if(stack.getItemDamage() < 0 || stack.getItemDamage() >= Material.Materials.values().length)
			return Material.Materials.values()[0];

		return Material.Materials.values()[stack.getItemDamage()];
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getColorFromItemStack(ItemStack stack, int p_82790_2_) {
		return getMaterial(stack).getColor();
	}*/

}
