package com.mangomilk.design_decor.blocks.metal_support;

import com.mangomilk.design_decor.blocks.floodlight.FloodlightBlock;
import com.simibubi.create.foundation.data.AssetLookup;
import com.simibubi.create.foundation.data.SpecialBlockStateGen;
import com.tterrag.registrate.providers.DataGenContext;
import com.tterrag.registrate.providers.RegistrateBlockstateProvider;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.ModelFile;

import static com.mangomilk.design_decor.blocks.metal_support.MetalSupportBlock.HORIZONTAL_AXIS;

public class MetalSupportGenerator extends SpecialBlockStateGen {
    public MetalSupportGenerator() {
    }

    @Override
    protected int getXRotation(BlockState state) {
        return 0;
    }

    @Override
    protected int getYRotation(BlockState state) {

        if(state.getValue(HORIZONTAL_AXIS)== Direction.Axis.X)
            return 90;


        return 0;
    }


    public <T extends Block> ModelFile getModel(DataGenContext<Block, T> ctx, RegistrateBlockstateProvider prov, BlockState state) {
        return (Boolean)!state.getValue(MetalSupportBlock.TOP) ? AssetLookup.partialBaseModel(ctx, prov, new String[]{"bottom"}) : AssetLookup.partialBaseModel(ctx, prov, new String[0]);
    }
}
