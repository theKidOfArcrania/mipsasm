/*
 * Copyright (c) 2015 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.mipsasm.assembler;

import me.zhanghai.mipsasm.util.BitArray;

public class InstructionIndex implements Operand, Assemblable {

    static final int LENGTH = 26;

    private BitArray value;

    private InstructionIndex(BitArray value) {
        this.value = value;
    }

    public static InstructionIndex of(int value) {
        return new InstructionIndex(BitArray.ofInt(value, LENGTH));
    }

    public BitArray assemble(AssemblyContext context) {
        return value;
    }
}
