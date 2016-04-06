package com.minecolonies.blocks;

import com.minecolonies.configuration.Configurations;

public class BlockHutTownhall extends AbstractBlockHut
{
    protected BlockHutTownhall()
    {
        super();
        this.workingRange = Configurations.workingRangeTownhall;
    }

    @Override
    public String getName()
    {
        return "blockHutTownhall";
    }
}
