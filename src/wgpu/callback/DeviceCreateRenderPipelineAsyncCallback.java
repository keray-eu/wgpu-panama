package wgpu.callback;

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

import java.lang.invoke.MethodHandle;

public interface DeviceCreateRenderPipelineAsyncCallback extends WGPUCallback {
	/** Callback: void DeviceCreateRenderPipelineAsyncCallback [CreatePipelineAsyncStatus status, WGPURenderPipeline * pipeline, char const * message, size_t userdata] */
	void apply(CreatePipelineAsyncStatus status, WGPURenderPipeline pipeline, String message, long userdata);

	default void stub(final int status, final MemorySegment pipeline, final MemorySegment message, final long userdata) {
		var _status = CreatePipelineAsyncStatus.from(status);
		var _pipeline = isNull(pipeline) ? null : new WGPURenderPipeline(pipeline);
		var _message = isNull(message) ? null : message.getString(0);
		var _userdata = userdata;
		apply(_status, _pipeline, _message, _userdata);
	}

	public static FunctionDescriptor desc = functionDescriptor(null, JAVA_INT, POINTER, POINTER, JAVA_LONG);
	public static MethodHandle handle = findVirtual(DeviceCreateRenderPipelineAsyncCallback.class, "stub", methodType(void.class, int.class, MemorySegment.class, MemorySegment.class, long.class));

}
