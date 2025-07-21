package com.gregtechceu.gtceu.integration.cctweaked.peripherals;

import com.gregtechceu.gtceu.api.machine.feature.ITieredMachine;
import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.lua.MethodResult;
import dan200.computercraft.api.peripheral.GenericPeripheral;

public class TieredPeripheral implements GenericPeripheral {
    @Override
    public String id() {
        return "gtceu:tiered";
    }

    @LuaFunction
    public static MethodResult getTier(ITieredMachine machine) {
        return MethodResult.of(machine.getTier());
    }

    @LuaFunction
    public static MethodResult getMaxVoltage(ITieredMachine machine) {
        return MethodResult.of(machine.getMaxVoltage());
    }
}
