package wgpu.struct;

import wgpu.*;
import wgpu.impl.*;
import wgpu.struct.*;
import wgpu.enums.*;
import wgpu.callback.*;

import java.lang.foreign.*;
import org.jspecify.annotations.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.*;

public class RequiredLimits extends CStruct {
	public ChainedStruct nextInChain;
	public Limits limits = new Limits();

	protected static final int byteSize = 152;
	protected int byteSize() {
		return byteSize;
	}

	protected long store(Stack stack, long address) {
		put_value(address+0, stack.alloc(nextInChain));
		limits.store(stack, address+8);
		return address;
	}

	protected RequiredLimits load(long address) {
		nextInChain = ChainedStruct.from(get_long(address+0));
		limits = limits.load(address+8);
		return this;
	}
	public RequiredLimits() {}
}
