package wgpu;

public abstract class WGPUEnum {
	protected final int bits;
	protected final String name;
	protected WGPUEnum(int bits, String name) {
		this.bits = bits;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return String.format("0x%08x %s", bits, name);
	}
}
