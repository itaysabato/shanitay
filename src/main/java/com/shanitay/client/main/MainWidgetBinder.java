package com.shanitay.client.main;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.History;
import com.shanitay.client.AbstractSvgWidgetBinder;
import com.shanitay.client.PlaceType;
import com.shanitay.client.utils.Toy;
import com.shanitay.client.utils.ToyStopperHandler;
import com.shanitay.client.utils.Utils;
import com.shanitay.client.utils.gadgets.Dragger;
import com.shanitay.client.utils.gadgets.Spinner;
import org.vectomatic.dom.svg.OMSVGSVGElement;
import org.vectomatic.dom.svg.ui.SVGResource;

/**
 * Created By: Itay Sabato<br/>
 * Date: 19/05/12 <br/>
 * Time: 20:24 <br/>
 */
public class MainWidgetBinder extends AbstractSvgWidgetBinder {

    private SoundLoader soundLoader;
    private ElementLoader elementLoader;
    private AnimationLoader animationLoader;
    private OMSVGSVGElement svgElement;

    protected OMSVGSVGElement bindWidgets() {
        svgElement = getSvg();
        soundLoader = new SoundLoader();
        elementLoader = new ElementLoader(svgElement);
        animationLoader = new AnimationLoader(elementLoader);

        linkCredits();
        linkWatchRight();
        linkWatchLeft();
        linkCreate();
        bindBlackCube();
        bindGreenLine();
        bindRedLine();
        bindIgulColors();
        bindIgulSlide();
        bindSquareColor();
        bindCube2();
        bindUpTriIgul();
        bindCubes();
        bindCoolIgul();
        bindPartGreen();
        bindSlide();
        bindBigGroup();
        bindDoorMaker();
        bindPinkLine();
        bindColorDoor();
        bindHouse();
        Utils.attachToy(elementLoader.yellowLineDown, soundLoader.yellowLineDown, false, animationLoader.yellowLineDown);

        return svgElement;
    }

    private void bindHouse() {
        Utils.attachToy(elementLoader.house, soundLoader.house, false, animationLoader.house);
    }

    private void bindPinkLine() {
        Utils.attachToy(elementLoader.pinkLine, soundLoader.pinkLine, true, animationLoader.pinkLine);
    }

    private void bindDoorMaker() {
        animationLoader.redButton.setSound(soundLoader.redButton);
        Toy toy = new Toy(soundLoader.redButton, animationLoader.redButton) {
            @Override
            public void play() {
                animationLoader.redButton.play();
            }
        };
        Utils.attachToy(elementLoader.redButton, toy);
        Utils.attachToy(elementLoader.pinkButton, toy);
    }

    private void bindSlide() {
        Dragger dragger = new Dragger(svgElement, 0, -140, 0, 150);
        dragger.makeDraggable(elementLoader.slide, soundLoader.slideForward, soundLoader.slideBackward);
    }

    private void bindBigGroup() {
        Dragger dragger = new Dragger(svgElement, 0, 0, 200, 0);
        dragger.makeDraggable(elementLoader.bigGroup, soundLoader.bigForward, soundLoader.bigBackward);
    }

    private void bindPartGreen() {
        Utils.attachToy(elementLoader.partGreen, soundLoader.partGreen, true, animationLoader.partGreen);
    }

    private void bindCoolIgul() {
        final Toy toy = Utils.attachToy(elementLoader.coolIgul1, soundLoader.coolIgul, true, animationLoader.coolIgul);
        ToyStopperHandler toyStopperHandler = new ToyStopperHandler(toy);
        Utils.addHandler(elementLoader.coolIgul2, toyStopperHandler);
        Utils.addHandler(elementLoader.coolIgul3, toyStopperHandler);
        Utils.addHandler(elementLoader.coolIgul4, toyStopperHandler);
        Utils.addHandler(elementLoader.coolIgul5, toyStopperHandler);
    }

    private void bindColorDoor() {
        final Toy toy = Utils.attachToy(elementLoader.colorDoor1, soundLoader.colorDoor, true, animationLoader.colorDoor);

        ToyStopperHandler toyStopperHandler = new ToyStopperHandler(toy);
        Utils.addHandler(elementLoader.colorDoor2, toyStopperHandler);
        Utils.addHandler(elementLoader.colorDoor3, toyStopperHandler);
        Utils.addHandler(elementLoader.colorDoor4, toyStopperHandler);
        Utils.addHandler(elementLoader.colorDoor5, toyStopperHandler);
    }

    private void bindCubes() {
        Utils.attachToy(elementLoader.orangeCube, soundLoader.orangeCube, false, animationLoader.orangeCube);
        Utils.attachToy(elementLoader.blueCube, soundLoader.blueCube, false, animationLoader.blueCube);
        Utils.attachToy(elementLoader.yellowMiddleCube, soundLoader.yellowMiddleCube, false, animationLoader.yellowMiddleCube);
        Utils.attachToy(elementLoader.pinkCube, soundLoader.pinkCube, false, animationLoader.pinkCube);
    }

    private void bindUpTriIgul() {
        Utils.attachToy(elementLoader.upTriIgul, soundLoader.upTriIgul, true, animationLoader.upTriIgul);
    }

    private void bindCube2() {
        Utils.attachToy(elementLoader.cube2, soundLoader.cube2, true, animationLoader.cube2Move);
    }

    private void bindSquareColor() {
        Utils.attachToy(elementLoader.squareColor, soundLoader.squareColor, true, animationLoader.squareColor);
    }

    private void bindIgulSlide() {
        Spinner spinner = new Spinner(soundLoader.igulSlidePos, soundLoader.igulSlideNeg);
        spinner.setBounds(0f, 200f);
        spinner.init(elementLoader.igulSlide, svgElement, 695.71f, 311.79f);
    }

    private void linkCreate() {
        Utils.SomeHandler someHandler = new Utils.SomeHandler() {
            public void handle() {
                History.newItem(PlaceType.ROBOT.name());
            }
        };

        Utils.addHandler(elementLoader.create, someHandler);
    }

    private void linkWatchRight() {
        Utils.SomeHandler someHandler = new Utils.SomeHandler() {
            public void handle() {
                History.newItem(PlaceType.CLIP.name());
            }
        };

        Utils.addHandler(elementLoader.watchRight1, someHandler);
        Utils.addHandler(elementLoader.watchRight2, someHandler);
        Utils.addHandler(elementLoader.watchRight3, someHandler);
        Utils.addHandler(elementLoader.watchRight4, someHandler);
    }

    private void linkCredits() {
        Utils.SomeHandler someHandler = new Utils.SomeHandler() {
            public void handle() {
                History.newItem(PlaceType.CREDITS.name());
            }
        };
        Utils.addHandler(elementLoader.credits, someHandler);
    }

    private void linkWatchLeft() {
        Utils.SomeHandler someHandler = new Utils.SomeHandler() {
            public void handle() {
                History.newItem(PlaceType.TRAILER.name());
            }
        };
        Utils.addHandler(elementLoader.logo5, someHandler);
    }

    private void bindRedLine() {
        Utils.attachToy(elementLoader.redLine, soundLoader.redLine, false, animationLoader.redLine);
    }

    private void bindGreenLine() {
        Utils.attachToy(elementLoader.greenLineDown, soundLoader.greenLineDown, false, animationLoader.greenLineDown);
    }

    private void bindIgulColors() {
        final Toy toy = Utils.attachToy(elementLoader.igulColor1, soundLoader.igulColor, true, animationLoader.igulColor);
        ToyStopperHandler toyStopperHandler = new ToyStopperHandler(toy);
        Utils.addHandler(elementLoader.igulColor2, toyStopperHandler);
        Utils.addHandler(elementLoader.igulColor3, toyStopperHandler);
        Utils.addHandler(elementLoader.igulColor4, toyStopperHandler);
    }

    private void bindBlackCube() {
        Utils.attachToy(elementLoader.blackCube, soundLoader.blackCube, false, animationLoader.blackCube);
    }

    private OMSVGSVGElement getSvg() {
        MainBundle mainBundle = GWT.create(MainBundle.class);
        final SVGResource svgResource = mainBundle.mainSvg();
        return svgResource.getSvg();
    }

    @Override
    protected void shutdown() {

    }
}
