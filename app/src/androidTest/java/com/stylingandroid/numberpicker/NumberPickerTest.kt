package com.stylingandroid.numberpicker

import android.view.InputDevice
import android.view.MotionEvent
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.GeneralClickAction
import androidx.test.espresso.action.GeneralLocation
import androidx.test.espresso.action.Press
import androidx.test.espresso.action.Tap
import androidx.test.espresso.action.ViewActions.actionWithAssertions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withParent
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NumberPickerTest {

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testNumberPicker() {
        onNumberPicker()
            .check(matches(isDisplayed()))
        onNumberPickerInput()
            .check(matches(withText("0")))

        onNumberPicker()
            .perform(click())
            .perform(clickBottomCentre)
        onNumberPickerInput()
            .check(matches(withText("1")))

        onNumberPicker()
            .perform(clickTopCentre)
        onNumberPickerInput()
            .check(matches(withText("0")))

        onNumberPicker()
            .perform(clickTopCentre)
        onNumberPickerInput()
            .check(matches(withText("10")))
    }

    private fun onNumberPicker() = onView(withId(R.id.number_picker))
    private fun onNumberPickerInput() = onView(withParent(withId(R.id.number_picker)))

    private val clickTopCentre =
        actionWithAssertions(
            GeneralClickAction(
                Tap.SINGLE,
                GeneralLocation.TOP_CENTER,
                Press.FINGER,
                InputDevice.SOURCE_UNKNOWN,
                MotionEvent.BUTTON_PRIMARY
            )
        )

    private val clickBottomCentre =
        actionWithAssertions(
            GeneralClickAction(
                Tap.SINGLE,
                GeneralLocation.BOTTOM_CENTER,
                Press.FINGER,
                InputDevice.SOURCE_UNKNOWN,
                MotionEvent.BUTTON_PRIMARY
            )
        )
}
