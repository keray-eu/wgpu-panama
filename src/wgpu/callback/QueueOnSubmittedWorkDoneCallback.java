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

public interface QueueOnSubmittedWorkDoneCallback extends WGPUCallback {
	/** Callback: void QueueOnSubmittedWorkDoneCallback [QueueWorkDoneStatus status, size_t userdata] */
	void apply(QueueWorkDoneStatus status, long userdata);

	default void stub(final int status, final long userdata) {
		var _status = QueueWorkDoneStatus.from(status);
		var _userdata = userdata;
		apply(_status, _userdata);
	}

	public static FunctionDescriptor desc = functionDescriptor(null, JAVA_INT, JAVA_LONG);
	public static MethodHandle handle = findVirtual(QueueOnSubmittedWorkDoneCallback.class, "stub", methodType(void.class, int.class, long.class));

}
