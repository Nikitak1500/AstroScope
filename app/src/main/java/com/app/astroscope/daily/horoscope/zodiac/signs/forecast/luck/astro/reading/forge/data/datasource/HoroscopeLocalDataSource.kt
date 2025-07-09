package com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.data.datasource

import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.R
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.Horoscope
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.HoroscopeSection
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.SectionType
import com.app.astroscope.daily.horoscope.zodiac.signs.forecast.luck.astro.reading.forge.domain.model.ZodiacSign
import jakarta.inject.Inject

class HoroscopeLocalDataSource @Inject constructor() {
    private val zodiacSigns = listOf(
    ZodiacSign(1, "Aries", "March 21 – April 20", R.mipmap.ic_aries),
    ZodiacSign(2, "Taurus", "April 21 – May 21", R.mipmap.ic_taurus),
    ZodiacSign(3, "Gemini", "May 22 – June 21", R.mipmap.ic_gemini),

    ZodiacSign(4, "Cancer", "June 22 – July 22", R.mipmap.ic_cancer),
    ZodiacSign(5, "Leo", "July 23 – August 21", R.mipmap.ic_leo),
    ZodiacSign(6, "Virgo", "August 22 – September 23", R.mipmap.ic_virgo),

    ZodiacSign(7, "Libra", "September 24 – October 23", R.mipmap.ic_libra),
    ZodiacSign(8, "Scorpio", "October 24 – November 22", R.mipmap.ic_scorpio),
    ZodiacSign(9, "Sagittarius", "November 23 – December 21", R.mipmap.ic_sagittarius),

    ZodiacSign(10, "Capricorn", "December 22 – January 20", R.mipmap.ic_capricorn),
    ZodiacSign(11, "Aquarius", "January 21 – February 19", R.mipmap.ic_aquarius),
    ZodiacSign(12, "Pisces", "February 20 – March 20", R.mipmap.ic_pisces),
    )

    private val horoscopes = listOf(
        Horoscope(zodiacSigns[0], listOf(
            HoroscopeSection(SectionType.LOVE, "A surprise encounter may lead to something new.", "You’re open to new connections — don’t avoid random meetings. What seems accidental could turn into something meaningful."),
            HoroscopeSection(SectionType.WORK, "Time to take initiative.", "Your ideas are valuable today. Step up and take the lead — your energy will inspire others."),
            HoroscopeSection(SectionType.FINANCE, "Avoid impulsive purchases.", "Think twice before spending. Major expenses should be postponed to avoid regrets."),
            HoroscopeSection(SectionType.ENERGY, "High activity day.", "Use your physical energy wisely. Go for a workout or walk to clear your mind and boost confidence.")
        )),
        Horoscope(zodiacSigns[1], listOf(
            HoroscopeSection(SectionType.LOVE, "Emotional closeness strengthens your bond.", "Today brings a sense of comfort and depth in your relationship. Open your heart."),
            HoroscopeSection(SectionType.WORK, "Patience will be key.", "Things might move slowly today — avoid rushing. Focus on quality, not speed."),
            HoroscopeSection(SectionType.FINANCE, "Unexpected income is possible.", "A small but pleasant financial surprise may come your way — just don’t spend it all at once."),
            HoroscopeSection(SectionType.ENERGY, "Inner peace restores energy.", "Calming rituals or a moment of stillness can recharge you better than coffee.")
        )),
        Horoscope(zodiacSigns[2], listOf(
            HoroscopeSection(SectionType.LOVE, "An honest talk may bring clarity.", "It’s a great day to confess your feelings or address misunderstandings — communication is your superpower."),
            HoroscopeSection(SectionType.WORK, "Your charm opens doors.", "Use your natural eloquence to navigate tricky tasks or impress the right people."),
            HoroscopeSection(SectionType.FINANCE, "Avoid risky investments.", "Today’s not the day to take financial risks. Be cautious with unfamiliar opportunities."),
            HoroscopeSection(SectionType.ENERGY, "Friends help you recharge.", "Spending time with people who energize you will lift your spirits and motivation.")
        )),
        Horoscope(zodiacSigns[3], listOf(
            HoroscopeSection(SectionType.LOVE, "Someone close needs your support.", "Be there for your partner or friend. Emotional presence means more than words today."),
            HoroscopeSection(SectionType.WORK, "Time to tackle unfinished tasks.", "You’ll find satisfaction in checking off your to-do list — focus on long-delayed items."),
            HoroscopeSection(SectionType.FINANCE, "Good day to plan your budget.", "Sit down and organize your finances. A clear plan will ease your worries."),
            HoroscopeSection(SectionType.ENERGY, "You need rest.", "Don’t ignore signs of fatigue — a break will boost both your mind and body.")
        )),
        Horoscope(zodiacSigns[4], listOf(
            HoroscopeSection(SectionType.LOVE, "Your charisma attracts attention.", "You shine today — use that energy to strengthen your romantic or social connections."),
            HoroscopeSection(SectionType.WORK, "A challenge will reveal your strengths.", "Don’t avoid responsibility — proving yourself now could lead to recognition."),
            HoroscopeSection(SectionType.FINANCE, "Invest in learning, not image.", "Resist spending to impress. Consider online courses or books instead — long-term gains await."),
            HoroscopeSection(SectionType.ENERGY, "Ideal day for exercise.", "Your physical strength is peaking — use it to move, stretch, or explore outdoors.")
        )),
        Horoscope(zodiacSigns[5], listOf(
            HoroscopeSection(SectionType.LOVE, "Doubts may cloud your heart.", "Don’t bottle things up — expressing your worries can clear the air and bring relief."),
            HoroscopeSection(SectionType.WORK, "Great day for organization.", "You’re naturally detail-oriented — tackle analysis or plan refinement tasks today."),
            HoroscopeSection(SectionType.FINANCE, "Ads may tempt you — resist.", "Don’t let marketing dictate your spending. Stay focused on your real needs."),
            HoroscopeSection(SectionType.ENERGY, "Calm brings power.", "Time in solitude or nature will reset your energy and lift your thoughts.")
        )),
        Horoscope(zodiacSigns[6], listOf(
            HoroscopeSection(SectionType.LOVE, "Find balance through honest talk.", "Misunderstandings fade when you open up — vulnerability brings closeness."),
            HoroscopeSection(SectionType.WORK, "Collaboration brings results.", "Working together will be smoother today — seek synergy, not control."),
            HoroscopeSection(SectionType.FINANCE, "Read the fine print.", "That attractive offer might have hidden conditions — be careful before committing."),
            HoroscopeSection(SectionType.ENERGY, "Harmony is your fuel.", "Create a peaceful space around you — your mood and focus will improve.")
        )),
        Horoscope(zodiacSigns[7], listOf(
            HoroscopeSection(SectionType.LOVE, "Passion returns.", "Your magnetism is strong today. Don’t be afraid to express your desires."),
            HoroscopeSection(SectionType.WORK, "Avoid confrontation.", "Tensions might rise — stay calm and let logic lead instead of emotions."),
            HoroscopeSection(SectionType.FINANCE, "Cut back on entertainment spending.", "It’s okay to enjoy life, but today’s about choosing wisely — free fun exists."),
            HoroscopeSection(SectionType.ENERGY, "High physical potential.", "Use your energy for action — a productive day awaits if you channel it well.")
        )),
        Horoscope(zodiacSigns[8], listOf(
            HoroscopeSection(SectionType.LOVE, "Light-hearted chats may turn deeper.", "Your openness invites honest connection — don’t fear emotional depth."),
            HoroscopeSection(SectionType.WORK, "A great day to start something new.", "A spontaneous idea may lead to a valuable project — follow your curiosity."),
            HoroscopeSection(SectionType.FINANCE, "Small rewards bring joy.", "Treat yourself, just a little — you deserve it, and it won’t hurt your savings."),
            HoroscopeSection(SectionType.ENERGY, "Travel refreshes your mind.", "Even a short change of scenery can give you a mental reset. Plan a walk or daytrip.")
        )),
        Horoscope(zodiacSigns[9], listOf(
            HoroscopeSection(SectionType.LOVE, "Let go of the past.", "Reflection is healthy, but don’t let old stories block new beginnings in love."),
            HoroscopeSection(SectionType.WORK, "Steady effort brings results.", "Consistency beats speed today. One small step at a time moves the mountain."),
            HoroscopeSection(SectionType.FINANCE, "Plan ahead for the week.", "Budgeting now avoids stress later. It’s a perfect time to get organized."),
            HoroscopeSection(SectionType.ENERGY, "Sleep matters more than ever.", "Physical exhaustion is near. Prioritize quality rest and unplugging at night.")
        )),
        Horoscope(zodiacSigns[10], listOf(
            HoroscopeSection(SectionType.LOVE, "A friend may become something more.", "Someone in your circle may be sending quiet signals — are you noticing them?"),
            HoroscopeSection(SectionType.WORK, "Brilliant ideas come fast.", "Your creative thinking is sharp — write things down before they vanish!"),
            HoroscopeSection(SectionType.FINANCE, "Seek new income paths.", "Innovation can bring money — try selling your skill or launching a side gig."),
            HoroscopeSection(SectionType.ENERGY, "Channel energy into action.", "You're bursting with inspiration — move, build, create. Don’t sit still today.")
        )),
        Horoscope(zodiacSigns[11], listOf(
            HoroscopeSection(SectionType.LOVE, "Trust your intuition.", "Your emotional sensitivity is a strength — it will guide your conversations well."),
            HoroscopeSection(SectionType.WORK, "Control your emotions.", "Feelings may affect decisions — take a step back before reacting."),
            HoroscopeSection(SectionType.FINANCE, "Keep spending minimal.", "Simplicity is your ally today. Save rather than splurge — you’ll be glad later."),
            HoroscopeSection(SectionType.ENERGY, "Water soothes your soul.", "Swimming, a shower, or even listening to water sounds can bring peace and energy.")
        ))
    )

    fun getZodiacSigns(): List<ZodiacSign> = zodiacSigns

    fun getHoroscope(signId: Int): Horoscope = horoscopes[signId - 1]
}
