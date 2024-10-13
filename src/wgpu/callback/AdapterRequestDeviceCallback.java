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

public interface AdapterRequestDeviceCallback extends WGPUCallback {
	/** Callback: void AdapterRequestDeviceCallback [RequestDeviceStatus status, WGPUDevice * device, char const * message, size_t userdata] */
	void apply(RequestDeviceStatus status, WGPUDevice device, String message, long userdata);

	default void stub(final int status, final MemorySegment device, final MemorySegment message, final long userdata) {
		var _status = RequestDeviceStatus.from(status);
		var _device = isNull(device) ? null : new WGPUDevice(device);
		var _message = isNull(message) ? null : message.getString(0);
		var _userdata = userdata;
		apply(_status, _device, _message, _userdata);
	}

	public static FunctionDescriptor desc = functionDescriptor(null, JAVA_INT, POINTER, POINTER, JAVA_LONG);
	public static MethodHandle handle = findVirtual(AdapterRequestDeviceCallback.class, "stub", methodType(void.class, int.class, MemorySegment.class, MemorySegment.class, long.class));

}
