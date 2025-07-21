package com.gregtechceu.gtceu.integration.cctweaked.peripherals;

import com.gregtechceu.gtceu.api.machine.feature.IOverclockMachine;
import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.lua.MethodResult;
import dan200.computercraft.api.peripheral.GenericPeripheral;

public class OverclockPeripheral implements GenericPeripheral {
    @Override
    public String id() {
        return "gtceu:overclock";
    }

    @LuaFunction
    public static MethodResult getOverclockTier(IOverclockMachine machine) {
        return MethodResult.of(machine.getOverclockTier());
    }

    @LuaFunction
    public static void setOverclockTier(IOverclockMachine machine, int tier) {
        machine.setOverclockTier(tier);
    }

    @LuaFunction
    public static MethodResult getMaxOverclockTier(IOverclockMachine machine) {
        return MethodResult.of(machine.getMaxOverclockTier());
    }

    @LuaFunction
    public static MethodResult getMinOverclockTier(IOverclockMachine machine) {
        return MethodResult.of(machine.getMinOverclockTier());
    }

    @LuaFunction
    public static MethodResult getOverclockVoltage(IOverclockMachine machine) {
        return MethodResult.of(machine.getOverclockVoltage());
    }
}
