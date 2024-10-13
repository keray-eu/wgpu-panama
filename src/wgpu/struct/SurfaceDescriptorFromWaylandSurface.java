package wgpu.struct;

import wgpu.*;
import wgpu.impl.*;
import wgpu.struct.*;
import wgpu.enums.*;
import wgpu.callback.*;
import static wgpu.Statics.*;

import java.lang.foreign.*;
import org.jspecify.annotations.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.*;

public class SurfaceDescriptorFromWaylandSurface extends ChainedStruct {
	// ChainedStruct chain;
	public long display;
	public long surface;

	protected int sizeInBytes() {
		return 32;
	}

	protected void writeTo(WGPUWriter out) {
		out.pointer(super.next);
		out.write(SType.SurfaceDescriptorFromWaylandSurface);
		out.padding(4);
		out.write(display);
		out.write(surface);
	}

	protected SurfaceDescriptorFromWaylandSurface readFrom(WGPUReader in) {
		super.next = ChainedStruct.from(in.read_pointer());
		var sType = in.read_int();
		in.padding(4);
		display = in.read_long();
		surface = in.read_long();
		return this;
	}

	public SurfaceDescriptorFromWaylandSurface() {}

	public SurfaceDescriptorFromWaylandSurface(MemorySegment from) {
		readFrom(new WGPUReader(from));
	}

}
