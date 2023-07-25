public class InstrumentTest 
{
    public static void main(String[] args) 
    {
    	System.out.println("<---------------------------------->");
        
    	
    	Guitar guitar1 = new Guitar();
        guitar1.use();
        guitar1.stringTuner();
        guitar1.pluck();
        guitar1.play();
        
        
        System.out.println("<---------------------------------->");
        
        
        Violin violin1 = new Violin();
        violin1.use();
        violin1.stringTuner();
        violin1.play();
        violin1.bowing();
       
        
        System.out.println("<---------------------------------->");
        
        
        ElectronicsGuitar eGuitar = new ElectronicsGuitar();
        eGuitar.preset();
        
        
        System.out.println("<---------------------------------->");
        
        
        Cello cello1 = new Cello();
        cello1.longBowing();
        
        
        System.out.println("<---------------------------------->");
        
        
        Flute flute1 = new Flute();
        flute1.use();
        flute1.play();
        flute1.blowAir();
        
        
        System.out.println("<---------------------------------->");
        
        
        Harmonium harmonnium1 = new Harmonium();
        harmonnium1.use();
        harmonnium1.play();
        harmonnium1.blowAir();
        
        
        System.out.println("<---------------------------------->");
        
        SurgicalCutter cutter1 = new SurgicalCutter();
        cutter1.use();
        cutter1.sterile();
        cutter1.operate();
        
        System.out.println("<---------------------------------->");
        
        SurgicalNeedle needle1 = new SurgicalNeedle();
        needle1.use();
        needle1.sterile();
        needle1.operate();
        
        System.out.println("<---------------------------------->");
        
        Glucometer glucometer1 = new Glucometer();
        glucometer1.use();
        glucometer1.reader();
        glucometer1.operate();
        
        System.out.println("<---------------------------------->");
        
        ECGMachine ecgMachine1 = new ECGMachine();
        ecgMachine1.use();
        ecgMachine1.reader();
        ecgMachine1.operate(); 
    }
}

interface Instrument 
{
    void use();
}

abstract class MusicalInstrument implements Instrument 
{
    abstract void play();
}

abstract class StringMusicalInstrument extends MusicalInstrument 
{
    abstract void stringTuner();
}

abstract class AirBasedMusicalInstrument extends MusicalInstrument 
{
    abstract void blowAir();
}

abstract class DrumBasedMusicalInstrument extends MusicalInstrument 
{
    abstract void tuneSurface();
}


// ----------------------String based Instruments classes---------------------
class Guitar extends StringMusicalInstrument {
    public void use() 
    {
        System.out.println("Using Guitar");
    }
	public void play()
	{
		System.out.println("Playing Guitar");
	}
    void stringTuner()
    {
        System.out.println("Tuning Guitar");
    }

    void pluck() 
    {
        System.out.println("Plucking Guitar");
    }
}

class ElectronicsGuitar extends Guitar {
    public void preset() 
    {
        System.out.println("Auto-Preset in ElectricGuitar done");
    }
}

class Violin extends StringMusicalInstrument {
	public void use()
	{
		System.out.println("Using DrumBasedMusicalInstrument Tabla");
	}
	public void play()
	{
		System.out.println("Playing Violin");
	}
	public void stringTuner()
	{
		System.out.println("Tuning violin strings");
	}
	
    public void bowing() 
    {
        System.out.println("Bowing the violin");
    }
}

class Cello extends Violin {
    public void longBowing() 
    {
        System.out.println("Longbowing the Cello");
    }
}


// -------------------------Air based instruments classes-------------------------------
class Flute extends AirBasedMusicalInstrument {
	public void use()
	{
		System.out.println("Using AirBasedMusicalInstrument Flute");
	}
	
	public void play()
	{
		System.out.println("Playing Flute");
	}
    void blowAir() 
    {
        System.out.println("Blowing air ");
    }

    void playFlute() 
    {
        System.out.println("Played flute ");
    }
}

class Harmonium extends AirBasedMusicalInstrument {
	public void use()
	{
		System.out.println("Using AirBasedMusicalInstrument Harmonium");
	}
	
	public void play()
	{
		System.out.println("Playing Harmonium");
	}
    void blowAir() 
    {
        System.out.println("Blowing air ");
    }
    void playHarmonium() 
    {
        System.out.println("Played harmonium");
    }
}


//------------------Drum based instruments classes -----------------------
class Tabla extends DrumBasedMusicalInstrument {
	public void use()
	{
		System.out.println("Using DrumBasedMusicalInstrument Tabla");
	}
	public void play()
	{
		System.out.println();
	}
    void tuneSurface() 
    {
        System.out.println("Tuned the surface of the instrument");
    }

    void playTabla() 
    {
        System.out.println("Playing Tabla");
    }
}

class Dhol extends DrumBasedMusicalInstrument {
	public void use()
	{
		System.out.println("Using DrumBasedMusicalInstrument Dhol");
	}
	public void play()
	{
		System.out.println("Playing Dhol");
	}
	
    void tuneSurface() 
    {
        System.out.println("Tuned the surface of the instrument");
    }

    void playDhol() 
    {
        System.out.println("Playing Dhol");
    }
}
//----------------------------------------------------------

// Medical instruments branch

abstract class MedicalInstrument implements Instrument
{
	abstract void operate();
}

abstract class SurgicalInstrument extends MedicalInstrument
{
	abstract void sterile();
}
abstract class PathologicalInstrument extends MedicalInstrument
{
	abstract void reader();
}

// Surgical Instruments
class SurgicalCutter extends SurgicalInstrument
{
	public void use()
	{
		System.out.println("Using SurgicalInstrument SurgicalCutter");
	}
	public void sterile()
	{
		System.out.println("Sterilising the SurgicalCutter");
	}
	public void operate()
	{
		System.out.println("Operating with SurgicalCutter");
	}
}
class SurgicalNeedle extends SurgicalInstrument
{
	public void use()
	{
		System.out.println("Using SurgicalInstrument SurgicalCutter");
	}
	public void sterile()
	{
		System.out.println("Sterilising the SurgicalCutter");
	}
	public void operate()
	{
		System.out.println("Operating with SurgicalCutter");
	}
}

// Pathological Instruments

class Glucometer extends PathologicalInstrument
{
	public void use()
	{
		System.out.println("Using PathologicalInstrument Glucometer");
	}
	public void reader()
	{
		System.out.println("Note the reading on Glucometer");
	}
	public void operate()
	{
		System.out.println("Operating with Glucometer");
	}
}
class ECGMachine extends PathologicalInstrument
{
	public void use()
	{
		System.out.println("Using PathologicalInstrument ECGMachine");
	}
	public void reader()
	{
		System.out.println("Note the reading on ECGMachine");
	}
	public void operate()
	{
		System.out.println("Operating with ECGMachine");
	}
}
