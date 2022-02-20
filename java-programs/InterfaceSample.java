//Write a java program to implement an interface with two methods.
interface WhatsAppCalls
	{
		void calls();
		void mute();
		void disconnect();
	}

class AudioCall implements WhatsAppCalls
	{
		public void calls()
			{
				System.out.println("Whatssapp Audio Call");
			}

		public void mute()
			{
				System.out.println("Whatssapp Audio Call muted");
			}
		public void disconnect()
			{
				System.out.println("Whatssapp Audio Call disconnected");
			}

	}

class VideoCall implements WhatsAppCalls
	{
		public void calls()
			{
				System.out.println("Whatssapp Video Call");
			}

		public void mute()
			{
				System.out.println("Whatssapp Video Call muted");
			}
		public void disconnect()
			{
				System.out.println("Whatssapp Video Call disconnected");
			}

	}

	class InterfaceSample
	{
		public static void main(String[] args)
		{
			AudioCall a=new AudioCall();
			VideoCall v=new VideoCall();
			a.calls();
			a.mute();
			a.disconnect();
			v.calls();
			v.mute();
			v.disconnect();

		}
	}