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

public class BindGroupLayoutEntryExtras extends ChainedStruct {
	// ChainedStruct chain;
	public int count;
	// padding 4

	protected static final int byteSize = 24;
	protected int byteSize() {
		return byteSize;
	}

	protected long store(Stack stack, long address) {
		put_value(address + 0, stack.alloc(next));
		put_value(address + 8, (int) SType.BindGroupLayoutEntryExtras);
		// padding 4
		put_value(address+16, (int) count);
		// padding 4
		return address;
	}

	protected BindGroupLayoutEntryExtras load(long address) {
		var _next = get_long(address + 0);
		// unit32_t sType
		// padding 4
		count = get_int(address+16);
		// padding 4
		super.next = ChainedStruct.from(_next);
		// padding 4
		return this;
	}
	public BindGroupLayoutEntryExtras() {}
}
