package com.gregtechceu.gtceu.integration.cctweaked.peripherals;

import com.gregtechceu.gtceu.api.machine.feature.IHasCircuitSlot;
import com.gregtechceu.gtceu.api.machine.feature.IOverclockMachine;
import com.gregtechceu.gtceu.common.item.IntCircuitBehaviour;
import dan200.computercraft.api.lua.LuaFunction;
import dan200.computercraft.api.lua.MethodResult;
import dan200.computercraft.api.peripheral.GenericPeripheral;

public class CircuitSlotPeripheral implements GenericPeripheral {
    @Override
    public String id() {
        return "gtceu:circuit_slot";
    }

    @LuaFunction
    public static MethodResult getCircuitConfiguration(IHasCircuitSlot circuitSlot) {
        return MethodResult.of(IntCircuitBehaviour
                .getCircuitConfiguration(circuitSlot.getCircuitInventory().getStackInSlot(0)));
    }

    @LuaFunction
    public static void setCircuitConfiguration(IHasCircuitSlot circuitSlot, int configuration) {
        var slotStack = circuitSlot.getCircuitInventory().getStackInSlot(0);
        if (configuration >= 0 && configuration <= IntCircuitBehaviour.CIRCUIT_MAX) {
            IntCircuitBehaviour.setCircuitConfiguration(slotStack, configuration);
        }
    }
}
