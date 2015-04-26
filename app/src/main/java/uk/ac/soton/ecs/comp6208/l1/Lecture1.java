package uk.ac.soton.ecs.comp6208.l1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openimaj.content.slideshow.PictureSlide;
import org.openimaj.content.slideshow.Slide;
import org.openimaj.content.slideshow.SlideshowApplication;

import uk.ac.soton.ecs.comp6208.utils.Utils;

@uk.ac.soton.ecs.comp6208.utils.annotations.Lecture(title = "L1: Building machines that see",
handoutsURL = "http://jonhare.github.io/COMP3204/handouts/pdf/L1-machines-that-see.pdf",
slidesURL = "http://jonhare.github.io/COMP3204/lectures/pdf/L1-machines-that-see.pdf")
@uk.ac.soton.ecs.comp6208.utils.annotations.JvmArgs(vmArguments = "-Xmx1G")
public class Lecture1 {
	public static void main(String[] args) throws IOException {
		final List<Slide> slides = new ArrayList<Slide>();

		for (int i = 1; i <= 51; i++)
			slides.add(new PictureSlide(Lecture1.class.getResource(String.format("l1.%03d.jpg", i))));

		new SlideshowApplication(slides, 1024, 768, Utils.BACKGROUND_IMAGE);
	}
}